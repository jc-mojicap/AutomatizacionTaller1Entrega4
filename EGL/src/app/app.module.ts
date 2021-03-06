import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';

//Estudiante
import {EstudianteListPage} from '../pages/Estudiante/list/Estudiante.list';
import {EstudianteEditPage} from '../pages/Estudiante/edit/Estudiante.edit';
import {EstudianteAddPage} from '../pages/Estudiante/add/Estudiante.add';
import {EstudianteService} from '../pages/Estudiante/services/Estudiante-service';
//Profesor
import {ProfesorListPage} from '../pages/Profesor/list/Profesor.list';
import {ProfesorEditPage} from '../pages/Profesor/edit/Profesor.edit';
import {ProfesorAddPage} from '../pages/Profesor/add/Profesor.add';
import {ProfesorService} from '../pages/Profesor/services/Profesor-service';
//Cursos
import {CursosListPage} from '../pages/Cursos/list/Cursos.list';
import {CursosEditPage} from '../pages/Cursos/edit/Cursos.edit';
import {CursosAddPage} from '../pages/Cursos/add/Cursos.add';
import {CursosService} from '../pages/Cursos/services/Cursos-service';
//Direccion
import {DireccionListPage} from '../pages/Direccion/list/Direccion.list';
import {DireccionEditPage} from '../pages/Direccion/edit/Direccion.edit';
import {DireccionAddPage} from '../pages/Direccion/add/Direccion.add';
import {DireccionService} from '../pages/Direccion/services/Direccion-service';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
  	  EstudianteListPage,
 	  EstudianteEditPage,
 	  EstudianteAddPage, 	  
  	  ProfesorListPage,
 	  ProfesorEditPage,
 	  ProfesorAddPage, 	  
  	  CursosListPage,
 	  CursosEditPage,
 	  CursosAddPage, 	  
  	  DireccionListPage,
 	  DireccionEditPage,
 	  DireccionAddPage, 	  
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
  	  EstudianteListPage,
 	  EstudianteEditPage,
 	  EstudianteAddPage, 	  
  	  ProfesorListPage,
 	  ProfesorEditPage,
 	  ProfesorAddPage, 	  
  	  CursosListPage,
 	  CursosEditPage,
 	  CursosAddPage, 	  
  	  DireccionListPage,
 	  DireccionEditPage,
 	  DireccionAddPage, 	  
   
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
  	  EstudianteService, 	  
  	  ProfesorService, 	  
  	  CursosService, 	  
  	  DireccionService, 	  
  ]
})
export class AppModule {}
