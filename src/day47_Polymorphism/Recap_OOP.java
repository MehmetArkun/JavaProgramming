package day47_Polymorphism;

public class Recap_OOP {

    /*

    -Main Advantages:
        -improves reusability
        -easy to maintain (parent classes - subclasses)
            -you will be storing all those common features in centralized structure
        -less memory
        -less codes
        -avoid duplication
        -flexible

    ENCAPSULATION = hiding the data -> control -> private -> setter -> condition
        private - we hide data by giving this access modifier as it is only accessible within object.
                    other objects do not have direct access to private data
                    we are making it restricted. only way to access to it is via getter.
        getter -
        setter - if private data is final, you can not generate setter

    INHERITANCE = building is a relation -> creation of base class -> no need to write common codes -> practical -> creating for once, usong multiple times
    overriding in accordance with different implementation, centralized structure,
    disadvantage of inheritance -> if created something in base class, all subclasses will use it

    ABSTRACTION = hiding implementation details, focusing on functionality, focusing on what it is, not how it is done
    how it is done is the responsiblity of subclass -> methods without implementation -> only show functionality,
    if different implementation needed child class can deal with it, you can acgieve with two ways->abstract class or interface
    Abstraction used in base class

            INTERFACE: multiple implements
            used for providing additional methods that classes
                        variable: static & final only
                        methods: abstract, static, default

           interface examples:
           WebDriver
           WebElement
           TakeScreenShot
           JavaScriptExecuter
           List
           Set

    POLYMORPHISM = Ability of objects to take on many forms. reference type is parent. object is child.
    only methods and variables in reference type can be called. if there is implementeqtion, then the method will be calledfrom child
    subtype has always more resources



    Method Overriding vs Method Overloading
    overload = any method. parameter must be different. return type does not matter.
    override = only instance method can be overriden. private final static no override. return type must be same


    class Testbase
setUp (@BeforeMethod):
    set the driver
    open the browser
    maximize the
    window
    implicitWait
    navigateToURL

tearDown (@AfterMethod):
    TakeScreenShot (If stailed)
    Quit

TestClass1 extends TestBase

TestClass2 extends TestBase


     */
}
