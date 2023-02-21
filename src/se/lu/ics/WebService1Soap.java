/**
 * WebService1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics;

public interface WebService1Soap extends java.rmi.Remote {

    /**
     * Returns a list of all Customers
     */
    public se.lu.ics.Customer[] getCustomers() throws java.rmi.RemoteException;

    /**
     * Returns a list of all Products
     */
    public se.lu.ics.Product[] getProducts() throws java.rmi.RemoteException;

    /**
     * Returns a list of all stores
     */
    public se.lu.ics.Store[] getStores() throws java.rmi.RemoteException;

    /**
     * Returns a list of all Product Categories
     */
    public se.lu.ics.ProductCategory[] getCategories() throws java.rmi.RemoteException;

    /**
     * Returns a list of all orders
     */
    public se.lu.ics.Order[] getOrders() throws java.rmi.RemoteException;
}
