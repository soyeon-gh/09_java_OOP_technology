package step9_01.OOP_Theory;

/*

# 제네릭(Generic)

- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
- 객체의 타입을 컴파일 시점에 체크하기 때문에 
  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/

class Client    { }
class Manager   { }
class Supervisor{ }

//제네릭을 구현하지 않았을 경우

class WithoutGeneric {
	
	Client[]     clients     = new Client[3];
	Manager[]    managers    = new Manager[3];
	Supervisor[] supervisors = new Supervisor[3];
	
	int clientsIdx    = 0;
	int managersIdx   = 0;
	int supervisorIdx = 0;
	
	void add(Client c) {
		clients[clientsIdx++] = c;
	}
	
	void add(Manager m) {
		managers[managersIdx++] = m;
	}
	
	void add(Supervisor s) {
		supervisors[supervisorIdx++] = s;
	}

	public Client getClients(int index) {
		return clients[index];
	}


	public Manager getManagers(int index) {
		return managers[index];
	}


	public Supervisor getSupervisors(int index) {
		return supervisors[index];
	}

}

//제네릭을 구현하였을 경우

class UsingGeneric<T> {
	
	Object arr[]   = new Object[3];
	int elementIdx = 0;
	
	void add(T data) {
		arr[elementIdx++] = data;
	}
	
	T get(int index) {
		return (T)arr[index];
	}
}

public class OOPEx11 {

	
	
	
	public static void main(String[] args) {
		
		UsingGeneric<Client>     clientList     = new UsingGeneric<Client>();
		UsingGeneric<Manager>    ManagerList    = new UsingGeneric<Manager>();
		UsingGeneric<Supervisor> SupervisorList = new UsingGeneric<Supervisor>();
		
		clientList.add(new Client());
		clientList.add(new Client());
		clientList.add(new Client());
		
		ManagerList.add(new Manager());
		ManagerList.add(new Manager());
		ManagerList.add(new Manager());
		
		SupervisorList.add(new Supervisor());
		SupervisorList.add(new Supervisor());
		SupervisorList.add(new Supervisor());
		
		System.out.println(clientList.get(0));
		System.out.println(clientList.get(1));
		System.out.println(clientList.get(2));
		System.out.println();
		
		System.out.println(ManagerList.get(0));
		System.out.println(ManagerList.get(1));
		System.out.println(ManagerList.get(2));
		System.out.println();
		
		System.out.println(SupervisorList.get(0));
		System.out.println(SupervisorList.get(1));
		System.out.println(SupervisorList.get(2));
		System.out.println();
	
	}

}
