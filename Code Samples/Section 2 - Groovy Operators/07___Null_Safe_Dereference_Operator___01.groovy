@groovy.transform.ToString
class Job {
    String roleName
    int salary
}

@groovy.transform.ToString
class Person {
    String name
    Job job
}

@groovy.transform.ToString
class Department {
    String deptName = 'Platform Engineering'
    Set<Person> staff = [
        new Person(name: 'Matt', job: new Job(roleName: 'Developer', salary: 32000)),
        new Person(name: 'Bhavin', job: new Job(roleName: 'Manager', salary: 38000))
    ]
}

println new Department()