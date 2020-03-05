public class Student {
  private int rating;
  private String name;

  public static int count = 0;
  public static int ratingSum = 0;

  public static void main(String[] args) {
    Student student1 = new Student("Student 1", 20);
    Student student2 = new Student();
    Student student3 = new Student("Student 2", 23);
  }

  public Student() {
    count++;
  }

  public Student(String name) {
    this.name = name;
    count++;
  }

  public Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
    count++;
  }

  public static double getAvgRating() {
    return ((count == 0) ? 0 : (double) ratingSum / count);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    ratingSum += rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    ratingSum -= this.rating;
    this.rating = rating;
    setRating(rating);
  }

  public static void removeStudent(Student student) {
    ratingSum -= student.rating;
    count--;
  }

  @Override
  public String toString() {
    return "Student: " + name + " Rating: " + rating;
  }
}
