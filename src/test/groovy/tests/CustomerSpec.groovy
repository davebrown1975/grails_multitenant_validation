package tests

import grails.testing.gorm.DataTest
import grails.testing.gorm.DomainUnitTest
import grails.validation.ValidationException
import spock.lang.Specification

class CustomerSpec extends Specification implements DataTest {
    Customer customer

    @Override
    Closure doWithConfig() {
        { config ->
            config.grails.gorm.multiTenancy.mode = null
        }
    }

    def setupSpec() {
        mockDomains Customer
    }

    void "requires firmId"() {
        when:
            customer = new Customer()
            customer.name = "Dave"
            customer.save(failOnError:true, flush:true )
        then:
            thrown ValidationException
    }
}
