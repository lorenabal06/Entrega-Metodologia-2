package ejerciciosclases;

public class InvalidTimePrueba {
    private int hour;
    private int minute;
    private int second;

    public InvalidTimePrueba(int hour, int minute, int second) throws InvalidTimeException {
        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) throws InvalidTimeException {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("La hora debe estar entre 0 y 23.");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) throws InvalidTimeException {
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Los minutos deben estar entre 0 y 59.");
        }
        this.minute = minute;
    }

    public void setSecond(int second) throws InvalidTimeException {
        if (second < 0 || second > 59) {
            throw new InvalidTimeException("Los segundos deben estar entre 0 y 59.");
        }
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) throws InvalidTimeException {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Usamos String.format() para manejar el formato de los ceros
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public InvalidTimePrueba nextSecond() throws InvalidTimeException {
        setSecond(second + 1);  // Usamos setSecond para validar el rango

        // Si llegamos a 60 segundos, restablecer a 0 y avanzar el minuto
        if (second == 0) {
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        setMinute(minute);  // Usamos setMinute para validar el rango de minutos
        setHour(hour);      // Usamos setHour para validar el rango de horas

        return this;
    }

    public InvalidTimePrueba previousSecond() throws InvalidTimeException {
        setSecond(second - 1);  // Usamos setSecond para validar el rango

        // Si llegamos a -1 segundos, restablecer a 59 y retroceder el minuto
        if (second == 59) {
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }

        setMinute(minute);  // Usamos setMinute para validar el rango de minutos
        setHour(hour);      // Usamos setHour para validar el rango de horas

        return this;
    }

    public static void main(String[] args) {
        try {
            InvalidTimePrueba t = new InvalidTimePrueba(23, 59, 59);
            System.out.println("Hora inicial: " + t);
            t.nextSecond();
            System.out.println("Después de nextSecond(): " + t);
            t.previousSecond();
            System.out.println("Después de previousSecond(): " + t);

            // Intentar establecer una hora inválida
            t.setTime(25, 30, 30);
        } catch (InvalidTimeException ex) {
            System.err.println("Excepción atrapada: " + ex.getMessage());
        }
    }
}
