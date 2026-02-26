

public class Student {
    private int studId, age, yearLevel;
    private String firstName, middleName, lastName, gender, course, email, address, phoneNumber;

    public Student(int studId, String firstName, String middleName, String lastName, int age, 
                   String gender, String course, int yearLevel, String email, String address, String phoneNumber) {
        this.studId = studId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.yearLevel = yearLevel;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

 
    public int getStudId() { return studId; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCourse() { return course; }
    public int getYearLevel() { return yearLevel; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}