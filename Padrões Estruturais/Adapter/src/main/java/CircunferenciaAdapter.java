public class CircunferenciaAdapter extends CircunferenciaGraus{

    private ICircunferencia circuferenciaRadianos;

    public CircunferenciaAdapter(ICircunferencia circuferenciaRadianos) {
        this.circuferenciaRadianos = circuferenciaRadianos;
    }

    public String resultado() {
        if (this.getGraus() >= 30)
            circuferenciaRadianos.setCircunferencia("TT/6");
        else
        if (this.getGraus() >= 60)
            circuferenciaRadianos.setCircunferencia("TT/4");
        else
        if (this.getGraus() >= 90)
            circuferenciaRadianos.setCircunferencia("TT/2");
        else
        if (this.getGraus() >= 180)
            circuferenciaRadianos.setCircunferencia("TT");
        else
        if (this.getGraus() >= 360)
            circuferenciaRadianos.setCircunferencia("2TT");

        return circuferenciaRadianos.getCircunferencia();
    }

    public void salvarResultado() {
        if (circuferenciaRadianos.getCircunferencia().equals("TT/6"))
            this.setGraus(30);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("TT/4"))
            this.setGraus(60);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("TT/2"))
            this.setGraus(90);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("TT"))
            this.setGraus(180);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("2TT"))
            this.setGraus(360);
    }
}
