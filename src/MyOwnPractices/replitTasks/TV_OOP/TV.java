package MyOwnPractices.replitTasks.TV_OOP;

public class TV {
        private int channel=1;
        private int volumeLevel=0;
        boolean on = false;
        private String brand;

        public TV(){
            System.out.println("Creating TV object using no args-constructor");
        }

        public TV(String brand){
            this.brand = brand;
            System.out.println("Creating TV object using 1 arg - constructor");
        }

        public boolean isOn(){
            on = true;
            return on;
        }

        public void turnOn(){
            if(on){
                on=true;
            } else {
                System.out.println("TV is already ON");
            }
        }

        public void turnOff(){
            on = false;
        }

        public void setVolumeLevel(int volumeLevel) {
            if(isOn()){
                if(volumeLevel > 0 && volumeLevel < 7){
                    this.volumeLevel = volumeLevel;
                }
            }
            else {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        }
        public int getVolumeLevel() {
            return volumeLevel;
        }

        public void setChannel(int channel) {
            if(channel > 0 && channel < 120){
                this.channel = channel;
            } else {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }
        }

        public int getChannel() {
            return channel;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void channelUp(){
            channel++;
        }

        public void channelDown(){
            channel--;
        }

        public void volumeUp(){
            volumeLevel++;
        }

        public void volumeDown(){
            volumeLevel--;
        }
}
