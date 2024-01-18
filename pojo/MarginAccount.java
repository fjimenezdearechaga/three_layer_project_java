package pojo;

import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {
    private BigDecimal margin;

    public MarginAccount(String id, BigDecimal margin){
        super(id);
        setMargin(margin);
    }

    public BigDecimal getMargin(){
        return this.margin;
    }

    public void setMargin(BigDecimal margin){
        this.margin = margin;
    }

    @Override
    public MarginAccount clone() {
       return new MarginAccount(this.getId(),this.getMargin());
    }

}
