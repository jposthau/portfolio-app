import React, { Component } from 'react';
import {BrowserRouter, Route} from 'react-router-dom';
import './App.css';
import TemporaryDrawer from './components/TemporaryDrawer';
import Home from './components/Home'
import Resume from './components/Resume'

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
				</div>
			</BrowserRouter>
		);
	}
}

export default App;