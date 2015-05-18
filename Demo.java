 public class Demo {
 
+	public double tinh(String phepToan, double x, double y) throws Exception {
+		if (phepToan.equals("x")) {
+			return x * y;
+		} else if (phepToan.equals("/")) {
+			if (x == 0)
+				throw new Exception();
+			return y / x;
+		} else if (phepToan.equals("+")) {
+			return x + y;
+		} else if (phepToan.equals("-")) {
+			return y - x;
+		} else if (phepToan.equals("^")) {
+			return Math.pow(y, x);
+		} else
+			throw new Exception();
+	}
+
+	public double tinh(String phepToan, double x, boolean ra) throws Exception {
+		if (phepToan.equals("log")) {
+			if (x <= 0)
+				throw new Exception();
+			return Math.log10(x);
+		} else if (phepToan.equals("ln")) {
+			if (x <= 0)
+				throw new Exception();
+			return Math.log(x);
+		} else if (phepToan.equals("sqrt")) {
+			if (x < 0)
+				throw new Exception();
+			return Math.sqrt(x);
+		} else if (phepToan.equals("!")) {
+			return giaiThua(x);
+		} else if (ra) {
+			if (phepToan.equals("sin")) {
+				return Math.sin(x);
+			}
+			if (phepToan.equals("cos")) {
+				return Math.cos(x);
+			}
+			if (phepToan.equals("tan")) {
+				if ((Math.abs(x) % Math.PI) == (Math.PI / 2))
+					throw new Exception();
+				return Math.tan(x);
+			}
+		} else {
+			double z = x * Math.PI / 180;
+			if (phepToan.equals("sin")) {
+				return Math.sin(z);
+			}
+			if (phepToan.equals("cos")) {
+				return Math.cos(z);
+			}
+			if (phepToan.equals("tan")) {
+				if ((Math.abs(x) % 180) == 90)
+					throw new Exception();
+				return Math.tan(z);
+			}
+		}
+		throw new Exception();
+
+	}
+
+	public double giaiThua(double x) throws Exception {
+		double i;
+		double s = 1;
+		double j = x - (int) x;
+		if (s < 0 || j > 0) {
+			throw new Exception();
+		}
+		for (i = x; i > 0; i--) {
+			s = s * i;
+		}
+		return s;
+	}
 }
