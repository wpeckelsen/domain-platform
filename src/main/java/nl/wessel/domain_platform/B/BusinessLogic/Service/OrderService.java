package nl.wessel.domain_platform.B.BusinessLogic.Service;

import nl.wessel.domain_platform.B.BusinessLogic.DTO.Deal.CreateDeal;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Deal.CreatedDeal;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Order.CreateOrder;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Order.CreatedOrder;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Deal;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Order;
import nl.wessel.domain_platform.C.Repository.OrderRepo;
import org.hibernate.sql.ordering.antlr.OrderByAliasResolver;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }



    public static Order orderMaker(CreateOrder createOrder){
        Order order = new Order();
        order.setWordCount(createOrder.getWordCount());
        order.setDueDate(createOrder.getDueDate());
        order.setTopic(createOrder.getTopic());
        order.setAnchorLink(createOrder.getAnchorLink());
        order.setLanguage(createOrder.getLanguage());
        return order;
    }



    public static CreatedOrder orderDtoMaker(Order order){
        CreatedOrder createdOrder = new CreatedOrder();
        createdOrder.setOrderID(order.getOrderID());
        createdOrder.setDueDate(order.getDueDate());
        createdOrder.setTopic(order.getTopic());
        createdOrder.setAnchorLink(order.getAnchorLink());
        createdOrder.setLanguage(order.getLanguage());
        return createdOrder;
    }




}
