import React, { Component } from 'react';
import './App.css';
import TemporaryDrawer from './components/TemporaryDrawer';
import ButtonBases from './components/ButtonBases'
import Bio from './components/Bio'
import { withStyles } from '@material-ui/core/styles';

class App extends Component {
	render() {
		return (
			<div>
				<TemporaryDrawer/>
				<div style={{backgroundColor: 'darkGrey', height: '62vh',}}>
					<Bio/>
				</div>
				<ButtonBases/>
			</div>
		);
	}
}

export default App;