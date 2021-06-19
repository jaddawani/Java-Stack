class Basic {

public static void count(){
int count = 0;
for(int i = 1 ; i < 255 ; i++){
System.out.println(i);
}
}

////////////////////////////////////////////////////////////////////

public static int countSum(){
int sum=0;
for (int i = 0 ; i < 256 ; i++){
sum+=i;
System.out.println("new num" + i +"sum" + sum);
} 
return sum;
}
//////////////////////////////////////////////////////////////////////
public static void odd(){
for (int i = 0 ; i < 255 ; i++){
if (i%2!=0){
System.out.println(i);
}
}

}

///////////////////////////////////////////////////////////////////////
public static void countArr(){
int[] numbers = {1,3,5,7,9,13};
for (int i = 0 ; i<numbers.length ; i++){
System.out.println(numbers[i]);

}
}
///////////////////////////////////////////////////////////////////////

public static int maxi(){


int[] numbers = {15,-3,-5,0,9,13};
int max = numbers[0];
for (int i = 0 ; i<numbers.length ; i++){

if (max<numbers[i]){
max= numbers[i];
}
System.out.println(numbers[i]);
}
return max;

}


///////////////////////////////////////////////////////////////////////

public static int countAvg(){
int sum=0;
int[] numbers = {2,10,3};
for (int i = 0 ; i< numbers.length ; i++){
sum+=numbers[i];
System.out.println(i);
} 
int avg = sum/numbers.length;
return avg;
}

//////////////////////////////////////////////////////////////////////////

public static ArrayList<Integer> OddArray() {
ArrayList<Integer> nums = new ArrayList<Integer>();
for(int i = 0; i <= 255; i++) {
if(i % 2 != 0)
nums.add(i);
}
return nums;
}
/////////////////////////////////////////////////////////////////////////////

public static int greater(int[] arr, int y) {
int count = 0;
for(int num: arr) {
if(num > y)
count++;
}
return count;
}
/////////////////////////////////////////////////////////////////////////////

public static void squareArray() {
int[] numbers = {1,3,5,7,9,13};

for(int i = 0; i < nums.length; i++) {
nums[i] = nums[i] * nums[i];	
}
}

/////////////////////////////////////////////////////////////////////////////

public static void negatives() {
int[] kalb = {1,3,5,7,9,13};
for(int i = 0; i < nums.length; i++) {
if(kalb[i] < 0)
kalb[i] = 0;
}
}
/////////////////////////////////////////////////////////////////////////////

public static int[] shift() {
int[] nums = {1,3,5,7,9,13};
for(int i = 0; i < nums.length; i++) {
if (i !=(nums.length-1)){
nums[i] = nums[i + 1];
}
else {
nums[i] = 0 ;
}
return nums;
}




}
}



/////////////////////////////////////////////////////////////////////////////


}
