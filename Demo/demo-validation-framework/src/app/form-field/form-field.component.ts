import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-form-field',
  templateUrl: './form-field.component.html',
  styleUrls: ['./form-field.component.css']
})
export class FormFieldComponent implements OnInit {

  ngForm: FormGroup
  errors = {name: [], age: []};

  constructor(private service: UserService) { }

  ngOnInit() {
    const self = this;
    self.ngForm = new FormGroup({
      name: new FormControl('', null),
      age: new FormControl('', null)
    })
  }

  submit(value) {
    const self = this;
    self.service.validate(value).subscribe((v: any) => {
      if (!v.isValid) {
        if (!v.errorMessage.error) {
          self.errors = v.errorMessage;
        }
        else {
          alert('Error: ' + v.errorMessage.error);
        }
      }
    })
  }
}
