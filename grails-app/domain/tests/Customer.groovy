package tests

import grails.gorm.MultiTenant

//class Customer {
class Customer implements MultiTenant<Customer> {
    String name
    Long firmId

    static constraints = {
        name nullable: false
        firmId nullable: false
    }

    static mapping = {
        tenantId name: 'firmId'
    }
}
