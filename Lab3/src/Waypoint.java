/**
 Этот класс представляет собой один шаг в пути, генерируемом путем
 Алгоритм. Точки пути состоят из местоположения, предыдущей точки пути в
 путь и некоторые значения затрат, используемые для определения наилучшего пути.
 **/
public class Waypoint {
    /*Местонахождение этой точки пути. **/
    Location loc;

    /**
     Предыдущая точка пути на этом пути, илиlt;код
     Корень поиска А*.
     **/
    Waypoint prevWaypoint;

    /**
     Это поле хранит общую предыдущую стоимость получения от начала
     расположение к этой точке пути, через цепочку точек пути. Это
     - фактическая стоимость следовать по пути; в нем не включены какие-либо оценки.
     **/
    private float prevCost;

    /**
     В этом поле хранится оценка оставшейся стоимости
     - эта точка пути к конечной точке назначения.
     **/
    private float remainingCost;


    /**
     Создать новую точку пути для указанного местоположения. Предыдущая точка пути
     - может быть дополнительно указано, или ссылка может быть код
     Укажите, что точка пути является началом пути.
     **/
    public Waypoint(Location loc, Waypoint prevWaypoint)
    {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }

    /**Возвращает местоположение точки пути. **/
    public Location getLocation()
    {
        return loc;
    }

    /**
     Возвращает предыдущую точку пути или код
     - это начало пути.
     **/
    public Waypoint getPrevious()
    {
        return prevWaypoint;
    }

    /**
     Этот мутатор позволяет как предыдущую стоимость, так и оставшуюся стоимость
     набор в одном методе вызова. Обычно эти значения устанавливаются на том же уровне
     В любом случае, время.
     **/
    public void setCosts(float prevCost, float remainingCost)
    {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }

    /**
     Возвращает фактическую стоимость добраться до этой точки с самого начала
     местоположение, через ряд точек пути в этой цепочке.
     **/
    public float getPreviousCost()
    {
        return prevCost;
    }

    /**
     Возвращает оценку оставшейся стоимости путешествия из этого
     указать на конечный пункт назначения.
     **/
    public float getRemainingCost()
    {
        return remainingCost;
    }

    /**
     Возвращает общую смету расходов для этой точки. Это включает в себя
     фактическая стоимость добраться до этой точки от стартового местоположения, плюс
     - оценка оставшейся стоимости проезда с этого момента до
     Конечный пункт назначения.
     **/
    public float getTotalCost()
    {
        return prevCost + remainingCost;
    }
}
