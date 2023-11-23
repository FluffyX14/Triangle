public class Triangle{
	private String triangleType = "";
	private int perimeter;
	private int area;
	private int longest = 0;
	private int shortest1;
	private int shortest2;
	private int right;
	
	public String getTriangleType(int s1, int s2, int s3) {
	
		//calculates longest side
		if (s1 > longest) {
			longest = s1;
			shortest1 = s2;
			shortest2 = s3;
		}
		if (s2 > longest) {
			longest = s2;
			shortest1 = s1;
			shortest2 = s3;
		}
		if (s3 > longest) {
			longest = s3;
			shortest1 = s1;
			shortest2 = s2;
		}
		
		if (s1 != s2 && s2 != s3 && s1 != s3) {
			if (triangleType == "") {
				triangleType += "scalene";
			}
			else {
				triangleType += " and scalene";
			}
			perimeter = s1 + s2 + s3;
		}
		if (s1 == s2 && s2 == s3) {
			if (triangleType == "") {
				triangleType += "equilateral";
			}
			else {
				triangleType += " and equilateral";
			}
			perimeter = s1 + s2 + s3;
		}
		if ( (Math.pow(s1,2)+ Math.pow(s2,2)) == Math.pow(s3,2)) {
			right = 1;
			if (triangleType == "") {
				triangleType += "right";
			}
			else {
				triangleType += " and right";
			}
			perimeter = s1 + s2 + s3;
			area = (shortest1 * shortest2) / 2;
		}
		if ((s1 == s2 && s2 != s3) || (s2 == s3 && s3 != s1) || (s1 == s3 && s3 != s2)){
			if (triangleType == "") {
				triangleType += "isosceles";
			}
			else {
				triangleType += " and isosceles";
			}
			perimeter = s1 + s2 + s3;
		}
		
		return triangleType;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public String getTriangleType() {
		return triangleType;
	}

	public void setTriangleType(String triangleType) {
		this.triangleType = triangleType;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLongest() {
		return longest;
	}

	public void setLongest(int longest) {
		this.longest = longest;
	}

	public int getShortest1() {
		return shortest1;
	}

	public void setShortest1(int shortest1) {
		this.shortest1 = shortest1;
	}

	public int getShortest2() {
		return shortest2;
	}

	public void setShortest2(int shortest2) {
		this.shortest2 = shortest2;
	}
}