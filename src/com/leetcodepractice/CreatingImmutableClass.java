package com.leetcodepractice;

/*This is how you declare a class as immutable*/
public final class CreatingImmutableClass {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final double salary;

    public CreatingImmutableClass(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Detail of an Employee: \n" + "ID = " + id + "       First Name = '" + firstName + '\'' + "      Last Name='" + lastName + '\'' + "      salary=" + salary;
    }
}
