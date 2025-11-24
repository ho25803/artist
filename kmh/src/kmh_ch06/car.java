package kmh_ch06;
// page.300
public class car {
	String model;
	int speed;
	Car( String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed =speed;
	}
	
	void run() {
		for(int i=10; i<=50; i=+10) {
			this.setSpeed(i);
			System.out.print(this.model + "가 달립니다. (시속:" + this.speed +"km/h");
		}
	}
}

void Showinfo()


void AddSpeed(int amount) {
	speed += amount;
	Showinfo();
}

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Hyundai", "Sonata", 100, 0) ;
		car1.ShowInfo();
		car1.AddSpeed(40); //이렇게 하면 car1이 만들어지고 변수가 지정되지 않았기 때문에 아무일도 벌어지지 않아서 오류가 발생한다.
	}
}