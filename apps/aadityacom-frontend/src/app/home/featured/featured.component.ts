import { Component, effect, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserProductService } from '../../shared/service/user-product.service';
import { Pagination } from '../../shared/model/request.model';
import { injectQuery } from '@tanstack/angular-query-experimental';
import { firstValueFrom } from 'rxjs';
import { ProductCardComponent } from '../../shop/product-card/product-card.component';

@Component({
  selector: 'ecom-featured',
  standalone: true,
  imports: [CommonModule, ProductCardComponent],
  templateUrl: './featured.component.html',
  styleUrl: './featured.component.scss',
})
export class FeaturedComponent {
  productService = inject(UserProductService);

  pageRequest: Pagination = {
    page: 0,
    size: 20,
    sort: [],
  };

  featuredProductQuery = injectQuery(() => ({
    queryKey: ['featured-products', this.pageRequest.page, this.pageRequest.size], // Use serializable values
    queryFn: () => firstValueFrom(this.productService.findAllFeaturedProducts(this.pageRequest)), // Fix async issue
  }));

  constructor() {
    effect(() => {
      console.log('Fetching featured products...', this.featuredProductQuery.data);
    });
  }
}
