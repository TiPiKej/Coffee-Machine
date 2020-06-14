class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        hours = minutes == 59 ? (hours == 12 ? 1 : hours + 1) : hours;
        minutes = minutes == 59 ? 0 : minutes + 1;
    }
}