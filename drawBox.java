class drawBox{
	public static void main(String[] args){
		drawLine();
		drawTopHalf();
		drawBottonHalf();
		drawLine();
	}
	public static void drawLine(){
		System.out.println("+------+");
	}
	public static void drawTopHalf(){
		int i;
		for(int line=1;line<=3;line ++){
			System.out.print("|");
			for(i=1;i<=line-1;i++){
				System.out.print(" ");
			}
			//每行输入line-1个空格
			System.out.print("\\");
			//每行输入一个反斜号
			for(i=1;i<=(6-2*line);i++){
				System.out.print(".");
			}
			//每行输入6-2*line个点
			System.out.print("/");
			//每行输入一个斜号
			for(i=1;i<=line-1;i++){
				System.out.print(" ");
			}
			//每行输入line-1个空格
			System.out.println("|");
		}
	}
	public static void drawBottonHalf(){
		int i;
		for(int line=1;line<=3;line ++){
			System.out.print("|");
			for(i=1;i<=3-line;i++){
			System.out.print(" ");
			}
			//每行输入3-line个空格
			System.out.print("/");
			//每行输入一个斜号
			for(i=1;i<=(2*line-2);i++){
				System.out.print(".");
			}
			//每行输入2*line-2个点
			System.out.print("\\");
			//每行输入一个反斜号
			for(i=1;i<=3-line;i++){
				System.out.print(" ");
			}
			//每行输入3-line个空格
			System.out.println("|");	
		}

	}
	}
