# Spring Core IoC

## BeanFactory

BeanFactory is the root interface of the Spring IoC container. It is a collection of objects that represent the beans (components) and their properties. BeanFactory can be obtained by calling the `getBeanFactory()` method of the `ApplicationContext`, which is the child interface of BeanFactory.

BeanFactory has several methods to create and get the beans, such as:

- `getBean(String beanName)`: returns the bean with the specified name, or null if it does not exist.
- `getBeansOfType(Class<?>... classes)`: returns a list of all the beans that are of the specified types.
- `getBeansWithAnnotation(Class<? extends Annotation> annotationClass)`: returns a list of all the beans that have the specified annotation.
- `getBeansByType(Class<?> type)`: returns a list of all the beans that are of the specified type.

## ApplicationContext

ApplicationContext is the child interface of BeanFactory. It is a more complete and flexible container that offers additional features such as:

- Support for AOP (Aspect Oriented Programming), I18N (Internationalization), RIBA (Resource Injection Based Aspect), etc.
- Support for different types of configurations: XML, Java, JNDI, etc.
- Support for different types of contexts: standalone, web, etc.

ApplicationContext has several methods to access and manipulate the beans and their properties, such as:

- `getBean(String beanName)`: returns the bean with the specified name and initializes its parameters if any.
- `getBeansOfType(Class<?>... classes)`: returns a list of all the beans that are of any of the specified types.
- `getBeansWithAnnotation(Class<? extends Annotation> annotationClass)`: returns a list of all the beans that have any annotation specified.
- `getBean(String beanName, Object... initParameters)`: returns a new instance of a bean with an empty constructor and initializes its parameters if any.
- `getBeansWithAnnotation(Class<? extends Annotation> annotationClass, Object... initParameters)`: returns a list of all new instances of beans with an empty constructor and any annotation specified.

## Singleton Vs Prototype

The beans can be created as singleton or as prototype in Spring Core IoC. A singleton is an only object created once by first time. A prototype is an object created every time it is requested and discarded when it is no longer needed.

The difference between singleton and prototype can be determined by using annotations or properties to define them:

| Annotation | Singleton | Prototype |
| --- | --- | --- |
| @Component | Yes | No |
| @Service | Yes | No |
| @Repository | Yes | No |
| @Controller | Yes | No |

También can be determined by using properties to define them:

| Property | Scope = "singleton" in XML or SINGLETON in Java | Scope = "prototype" in XML or PROTOTYPE in Java |
| --- | --- | --- |
| scope = "singleton" in XML or SINGLETON in Java | Yes | No |
| scope = "prototype" in XML or PROTOTYPE in Java | No | Yes |

## Setter Injection

Setter injection is a way to inject dependencies between objects using setter methods. It is used when we do not know what class implements an interface abstractly or when we want to control how an object is initialized.

To perform setter injection in Spring Core IoC we use the annotation @Autowired instead of setter method corresponding. For example:

```java
public class User {
    private String name;
    private int age;

    // Constructor without parameters
    public User() {
        // Initialize properties with default values
    }

    // Constructor with parameters
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter without parameters
    public void setName(String name) {
        this.name = name;
    }

    // Setter with parameters
    public void setAge(int age) {
        this.age = age;
    }

    // Getter without parameters
    public String getName() {
```

## Autowire

Autowire is an annotation that allows you to automatically inject the dependencies of a bean into another bean. It is used when you do not explicitly specify the type or name of the bean that you want to inject. For example:

```java
// Bean A injects bean B
public class A {
    @Autowired // Autowire bean B
    private B b;

    // Constructor, getter and setter
}

// Bean B has no dependencies
public class B {
    // Constructor, getter and setter
}
```

Autowire can be of two types: constructor or field. The type of autowire can be specified by using the `@Autowired` annotation or by using the XML configuration. For example:

```xml
<!-- Autowire constructor -->
<bean id="a" class="com.example.A">
    <constructor-arg ref="b"/>
</bean>

<!-- Autowire field -->
<bean id="b" class="com.example.B"/>
<bean id="a" class="com.example.A">
    <field-annotation>
        <required>true</required>
        <autowired/>
    </field-annotation>
</bean>
```

## Primary Bean

A primary bean is a bean that has priority over other beans with the same name. This means that when a bean is requested by its name, the primary bean is returned instead of the other one. A primary bean can be defined by using the `@Primary` annotation or by using the XML configuration. For example:

```java
// Bean A is a primary bean
@Component("a")
@Primary // Indicates that it is a primary bean
public class A {
    // Constructor, getter and setter
}

// Bean B is not a primary bean
@Component("b")
public class B {
    // Constructor, getter and setter
}
```

To use a primary bean in another component, you must indicate its name in single quotes. For example:

```java
// Bean C uses the primary bean a by its name "a"
@Component("c")
public class C {
    @Autowired // Automatically injects the primary bean a by its name "a"
    private String name;

    public String getName() {
        return name;
    }
}
```

- [Inversion of Control and Dependency Injection with Spring](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring): A complete tutorial on IoC and DI with Spring, with practical examples and detailed explanations.
- [Spring IoC, Spring Bean Example Tutorial](https://www.digitalocean.com/community/tutorials/spring-ioc-bean-example-tutorial): A step-by-step tutorial on how to create and configure beans with Spring IoC and how to use different types of contexts.
- [Spring Core Tutorial](https://www.javaguides.net/p/spring-core-tutorial.html): An introductory tutorial on the fundamental concepts of Spring Core, such as components, dependency injection, scheduled aspects, etc.
- [Spring – Understanding Inversion of Control with Example](https://www.geeksforgeeks.org/spring-understanding-inversion-of-control-with-example/): An article that explains the logic behind IoC and DI with simple and clear examples.
