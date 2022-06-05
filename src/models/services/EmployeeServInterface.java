package models.services;

import models.entities.EmployeeEnti;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeServInterface {
    /**
     * Gets an employee's information in form of an EmployeeEnti object to be
     * passed to EmployeeRepo for being saved in the database.
     * @param employee an EmployeeEnti object containing an employee's information to be added to the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void saveEmployee (EmployeeEnti employee) throws SQLException;

    /**
     * Searches among the employees based on searchQuery and gives
     * the count of employees that the search result has, to be used
     * in determining the page counts required to be shown in UI
     * @param searchQuery what to be searched for
     * @return the count of employees that the search result has
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    int getEmployeesCount (String searchQuery) throws SQLException;

    /**
     * Searches among the employees based on searchQuery and
     * gives a limited list of employees as EmployeeEnti objects
     * filled with only necessary information, including: id, name and position.
     * The result is based on the page count and search query;
     * @param searchQuery what to be searched for
     * @param pageNumber the page number that user(admin) wants
     * @return a list of EmployeeEnti objects filled with id, name and position.
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    List<EmployeeEnti> getEmployeesList (String searchQuery, int pageNumber) throws SQLException;

    /**
     * Gets the id of an employee and returns all its information
     * in form of an EmployeeEnti object
     * @param id id of the wanted employee
     * @return information of the employee
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    EmployeeEnti getEmployeeInfo (int id) throws SQLException;

    /**
     * Gets an employee's information in form of an EmployeeEnti object to be
     * passed to EmployeeRepo for being replaced with the old information of the employee.
     * @param employee an EmployeeEnti object containing an employee's information to be edited in the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void editEmployee(EmployeeEnti employee) throws SQLException;

    /**
     * Gets an employee's id and calls a EmployeeRepo method
     * to delete it from the database
     * @param id id of the employee you want to remove
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void removeEmployee(int id) throws SQLException;

    /**
     * Searches among the employees and gives a list of
     * employees who are a member of a department.
     * @param deptId department id to get its members
     * @return a list of EmployeeEnti objects filled with id, name and position.
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    List<EmployeeEnti> getDepartmentMembers (int deptId) throws SQLException;

    /**
     * Gets id of a department that is deleted and
     * kicks the former employees out of the department
     * @param deptId id of the employee you want to remove
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void evacuateDepartment(int deptId) throws SQLException;
}
