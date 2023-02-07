package WeekendHM;

public class Guitar {
    String type;
    String wood;
}


class Electric extends Guitar{

    String name;
    int pickups;
}

class Acoustic extends Guitar{
    String size;
}

class Body extends Electric{
    String bodyType;
}
