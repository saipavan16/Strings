//Reverse the string using the Array without affecting special charaters.
class ReverseString{

	public static void main(String [] args){
		System.out.println(revString("bam,$p"));
	}
	
	public static String revString(String input){
		
		char [] inputarr = input.toCharArray();
		int l = 0;
		int r = inputarr.length - 1;
		while(l<r){
			if(!Character.isAlphabetic(inputarr[l])){
				l++;
			}
			else if (!Character.isAlphabetic(inputarr[r])){
			r--;
			}
		else{
			
			char tempchar = inputarr[l];
			inputarr[l] = inputarr[r];
			inputarr[r] = tempchar;
			l++;
			r--;
		}
	}
		return new String(inputarr);
	}
}

