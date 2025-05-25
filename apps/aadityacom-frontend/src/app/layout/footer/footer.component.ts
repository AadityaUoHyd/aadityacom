import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FaIconComponent, FaIconLibrary } from '@fortawesome/angular-fontawesome';
import { faCartFlatbedSuitcase } from '@fortawesome/free-solid-svg-icons';
import { faSquareInstagram, faYoutube, faFacebook } from '@fortawesome/free-brands-svg-icons';

@Component({
  selector: 'ecom-footer',
  standalone: true,
  imports: [CommonModule, FaIconComponent],
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.scss'
})
export class FooterComponent {
  currentYear: number = new Date().getFullYear();

  constructor(library: FaIconLibrary) {
    library.addIcons(faCartFlatbedSuitcase, faSquareInstagram, faYoutube, faFacebook);
  }
}
