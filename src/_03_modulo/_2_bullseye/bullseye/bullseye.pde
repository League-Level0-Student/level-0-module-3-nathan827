
void setup() {
 size(500,500);
  // set the size of your sketch
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
for(int ellipse = 400; ellipse > 0; ellipse -= 1){
  if(ellipse % 100 == 0){
   fill(500,0,0); 
   ellipse(250,250,ellipse,ellipse);
  }
  if(ellipse % 100 == 50){
    fill(0,0,0);
    ellipse(250,250,ellipse,ellipse);
  }
    
}
  //Use an if statement and modulo to alternate the color of your rings.
  
}
