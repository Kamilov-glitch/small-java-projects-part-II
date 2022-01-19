

public class Checker {
    
    public Checker() {
        
    }
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    public boolean timeOfDay(String string) {
        String regex = "([0-9]{2}:){2}[0-9]{2}";
        if (!string.matches(regex)) {
            return false;
        }
        String[] parts = string.split(":");
        int hour = Integer.valueOf(parts[0]);
        int minute = Integer.valueOf(parts[1]);
        int second = Integer.valueOf(parts[2]);
        if (hour < 24 && hour >= 0 &&
            minute < 60 && minute >= 0 &&
            second < 60 && second >= 0) {
            return true;
        }
        return false;
    }
    
    
}
