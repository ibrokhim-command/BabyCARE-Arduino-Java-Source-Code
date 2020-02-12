const int AOUTpin = 2;
const int DOUTpin = 8;


int limit;
int value;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(DOUTpin, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  value = analogRead(AOUTpin);
  limit = digitalRead(DOUTpin);
  Serial.print("CO value : ");
  Serial.println(value);
  Serial.print("Limit : ");
  Serial.print(limit);
  delay(3000);

  if (limit == HIGH){
    Serial.print("Allarm");
  }
  else{
    Serial.print("OK");
  }
}
