import React, { Component } from 'react';
import {BrowserRouter, Route} from 'react-router-dom';
import './App.css';
import TemporaryDrawer from './components/TemporaryDrawer';
import Home from './components/Home'
import Resume from './components/Resume'
import Crosswalk from './components/Crosswalk'
import BarkSensor from './components/BarkSensor'
import Website from './components/Website'

class App extends Component {
	render() {
		return (
			<BrowserRouter>
				<div>
					<TemporaryDrawer/>
					<Route exact={true} path='/' render={() => (
						<Home/>
					)}/>
					<Route exact={true} path='/resume' render={() => (
						<Resume/>
					)}/>
					<Route exact={true} path='/projects/crosswalk' render={() => (
						<Crosswalk/>
					)}/>
					<Route exact={true} path='/projects/barkSensor' render={() => (
						<BarkSensor/>
					)}/>
					<Route exact={true} path='/projects/website' render={() => (
						<Website/>
					)}/>
				</div>
			</BrowserRouter>
		);
	}
}

export default App;