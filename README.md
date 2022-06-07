# grails_multitenant_validation
Illustrates an issue with unit test validation when using multitenancy

Use via unit test, execute tests/CustomerSpec to see issue in action.

When Customer does not implement MultiTenant, when we attempt to save a Customer with no firmId specified, a ValidationException is thrown as expected.

When implement MultiTenant, then the exception is NOT thrown, despite us deactivating gorm multitenancy in the Spec.
