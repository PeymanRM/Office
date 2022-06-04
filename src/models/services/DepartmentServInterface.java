package models.services;

import models.entities.DepartmentEnti;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentServInterface {
    /**
     * Gets a department's information in form of a DepartmentEnti object to be
     * passed to DepartmentRepo for being saved in the database.
     * @param department a DepartmentEnti object containing a department's information to be added to the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void saveDepartment (DepartmentEnti department) throws SQLException;

    /**
     * Searches among the departments based on searchQuery and gives
     * the count of departments that the search result has, to be used
     * in determining the page counts required to be shown in UI
     * @param searchQuery what to be searched for
     * @return the count of departments that the search result has
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    int getDepartmentsCount (String searchQuery) throws SQLException;

    /**
     * Searches among the departments based on searchQuery and
     * gives a limited list of departments as DepartmentEnti objects
     * filled with only necessary information, including: id and name.
     * The result is based on the page count and search query;
     * @param searchQuery what to be searched for
     * @param pageNumber the page number that user(admin) wants
     * @return a list of DepartmentEnti objects filled with id, name.
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    List<DepartmentEnti> getDepartmentsList (String searchQuery, int pageNumber) throws SQLException;

    /**
     * Gets the id of a department and returns all its information
     * in form of a DepartmentEnti object
     * @param id id of the wanted department
     * @return information of the department
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    DepartmentEnti getDepartmentInfo (String id) throws SQLException;

    /**
     * Gets a department's information in form of a DepartmentEnti object to be
     * passed to DepartmentRepo for being replaced with the old information of the department.
     * @param department a DepartmentEnti object containing a department's information to be edited in the database
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void editDepartment(DepartmentEnti department) throws SQLException;

    /**
     * Gets a department's id and calls a DepartmentEnti method
     * to delete it from the database
     * @param id id of the department you want to remove
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    void removeDepartment(String id) throws SQLException;

    /**
     * Gets the id of a department and gives its name
     * @param id id of a department
     * @return name of the department
     * @throws SQLException
     */
    String getDepartmentName(String id) throws SQLException;

    /**
     * Gives the list of departments as DepartmentEnti objects
     * filled with only necessary information, including: id and name.
     * @return a list of DepartmentEnti objects filled with id, name.
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
    List<DepartmentEnti> getAllDepartments() throws SQLException;
}
