package assesementoverloading;
class Shapes{
	
	int volume(int a,int b,int c) {
		
		return a*b*c;
	}
	float volume(int l,float b,int h) {
    return l*b*h;
	
	}
	float volume(int p,float q,int i,int j,int k) {
		return p*q*i*j*k;
	
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
ShapeApp sa = new ShapeApp();
sa.volume(5, 6, 7);
sa.volume(16, 2.1f, 8);
sa.volume(4/3, 3.4f, 2,4,5);
	}

}
