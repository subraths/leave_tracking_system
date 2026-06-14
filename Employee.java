public class Employee {
  private int employeeID;
  private String name;
  private String department;
  private String email;

  private int leaveBalance = 20; // Annual leave balance in days

  public Employee(int employeeID, String name, String department, String email) {
    this.department = department;
    this.email = email;
    this.employeeID = employeeID;
    this.name = name;
  }

  public int getLeaveBalance() {
    return leaveBalance;
  }

  public void setLeaveBalance(int leaveBalance) {
    if (leaveBalance >= 0) {
      this.leaveBalance = leaveBalance;
    } else {
      System.out.println("Leave balance cannot be negative");
    }
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
