package Classes;

public class TradingActionClient extends Actor{

    private static int amount;
    private int actionID;
    private String actionName;

    public TradingActionClient(String name, String actionName, int actionID, int amount ) {
        super(name + " - участник акции");
        this.actionName = actionName;
        this.actionID = actionID;
        TradingActionClient.amount = amount;        
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    
    
}
