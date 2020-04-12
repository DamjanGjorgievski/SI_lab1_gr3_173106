class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	int tipA = 18;
	int tipB = 5;
	int tipC = 0;
	//TODO constructor

	public Item(int id, String name, double price, int tipA, int tipB, int tipC) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tipA = tipA;
		this.tipB = tipB;
		this.tipC = tipC;
	}

	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTipA() {
		return tipA;
	}

	public void setTipA(int tipA) {
		this.tipA = tipA;
	}

	public int getTipB() {
		return tipB;
	}

	public void setTipB(int tipB) {
		this.tipB = tipB;
	}

	public int getTipC() {
		return tipC;
	}

	public void setTipC(int tipC) {
		this.tipC = tipC;
	}

	double taxReturn () {
		//TODO
	}
	double getTaxReturn () {
		return getPrice() * getTipA() * 0.15;
	}
}