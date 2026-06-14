public class LeaveRequest {

  private int requestID;
  private Employee employee;
  private String startDate;
  private String endDate;
  private String status; // "Pending", "Approved", "Denied"
  private String reason;

  public LeaveRequest(int requestID, Employee employee, String endDate, String status, String startDate,
      String reason) {
    this.requestID = requestID;
    this.employee = employee;
    this.endDate = endDate;
    this.status = status;
    this.startDate = startDate;
    this.reason = reason;
  }

  public int getRequestID() {
    return requestID;
  }

  public void setRequestID(int requestID) {
    this.requestID = requestID;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
