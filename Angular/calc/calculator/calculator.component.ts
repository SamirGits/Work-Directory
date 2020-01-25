import { Component, OnInit } from '@angular/core';
import { calcPossibleSecurityContexts } from '@angular/compiler/src/template_parser/binding_parser';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
 

  calc(value1:HTMLInputElement, value2:HTMLInputElement, resultval:HTMLInputElement)
  {
  let a=parseInt(value1.value);
  let b=parseInt(value2.value);
  


  }

}