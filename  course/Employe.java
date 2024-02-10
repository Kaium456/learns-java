/*
 * public class Employe {
 * 
 * private int baseSalery;
 * private int hourlyRate;
 * 
 * public Employe(int baseSaler, int hourlyRate) {
 * setBaseSalery(baseSaler);
 * setHourlyRate(hourlyRate);
 * }
 * 
 * private int getBaseSalery() {
 * return baseSalery;
 * }
 * 
 * private void setBaseSalery(int baseSalery) {
 * if (baseSalery <= 0) {
 * throw new IllegalArgumentException("baseSaler can't be 0 or negative value");
 * }
 * this.baseSalery = baseSalery;
 * }
 * 
 * private int getHourlyRate() {
 * return hourlyRate;
 * }
 * 
 * private void setHourlyRate(int hourlyRate) {
 * if (hourlyRate <= 0) {
 * throw new
 * IllegalArgumentException("hourlyRate cant't be 0 or negative value");
 * }
 * this.hourlyRate = hourlyRate;
 * }
 * 
 * public int calculetSalery(int extraHour) {
 * return baseSalery + (extraHour * hourlyRate);
 * }
 * }
 */