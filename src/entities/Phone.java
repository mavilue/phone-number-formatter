package entities;

public record Phone(String ddd, String number, PhoneType typePhone) {

    public String format() {
        if (ddd == null){
            return typePhone == PhoneType.LANDLINE_PHONE ? number.substring(0,4) + "-" + number.substring(4)
                    : number.substring(0,5) + "-" + number.substring(5);
        } else{
            return typePhone == PhoneType.LANDLINE_PHONE ? "(" + ddd + ")" + number.substring(0,4) + "-" + number.substring(4)
                    : "(" + ddd + ")" + number.substring(0,5) + "-" + number.substring(5);
        }
    }
    
    @Override
    public String toString(){
        return format() + " (" + typePhone + ")";
    }

}
