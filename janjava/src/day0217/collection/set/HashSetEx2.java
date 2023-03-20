package day0217.collection.set;

import java.util.HashSet;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person) obj;
			if (age == other.age) {
				return name.equals(other.name);
			}
		}
		return false;
	}
}

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Person> team = new HashSet<>();

		team.add(new Person("kim", 11));
		team.add(new Person("bread", 11));
		team.add(new Person("choi", 10));
		team.add(new Person("kim", 10));

		for (Person person : team) {
			System.out.println(person.name + "/" + person.age + "세");
		}

	}

}
