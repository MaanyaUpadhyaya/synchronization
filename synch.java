import java.util.Random; class Counter{
private int count=0; synchronized void increment() {
try {
if(count==3) {
System.out.println("Count value is 3 and waiting for wait();
}
else {
notify(); }
}
catch(Exception e) {
System.out.println(e); }
}
decerement");
"+count);
count++;
System.out.println("Count is incremented and its value is:
synchronized void decrement() { try {
incerement");
is: "+count);
} }
if(count==0) {
System.out.println("Count value is 0 and waiting for
wait(); }
else { count--;
System.out.println("Count is decremented and its value notify();
catch(Exception e) { System.out.println(e);
} }
}
class Thread1 extends Thread{ Counter c;
Thread1(Counter c){ this.c=c;
}
public void run() {
Random r=new Random(); for(int i=0;i<5;i++) {
int s=r.nextInt(2000);

try {
c.increment();
sleep(s); }
catch(Exception e) { System.out.println(e);
} }
class Thread2 extends Thread{ Counter c;
Thread2(Counter c){ this.c=c;
}
public void run() {
Random r=new Random(); for(int i=0;i<5;i++) {
int s=r.nextInt(2000); try {
c.decrement();
sleep(s); }
catch(Exception e) { System.out.println(e);
} }
} }
} }

public class CounterUser {
public static void main(String[] args) {
Counter c=new Counter(); Thread1 t1=new Thread1(c); Thread2 t2=new Thread2(c); t1.start();
t2.start(); }
}
