class Triangle {
public static void main(String[] args){
void triangleMatrix() {
for (int row =1; row <= 10; row++) {
for(int col = row; col <= 10; col++) {
System.out.println(" ");
}
for (int col = 1; col <= row; col++) {
System.out.println("*");
}
Triangle matrix = new Triangle();
matrix.triangleMatrix();
}
}
}