package org.aadi.aadityacom.order.domain.order.aggregate;

import org.aadi.aadityacom.order.domain.order.vo.StripeSessionId;
import org.aadi.aadityacom.order.domain.user.vo.UserAddressToUpdate;
import lombok.Builder;

import java.util.List;

@Builder
public record StripeSessionInformation(StripeSessionId stripeSessionId,
                                       UserAddressToUpdate userAddress,
                                       List<OrderProductQuantity> orderProductQuantity) {
}
