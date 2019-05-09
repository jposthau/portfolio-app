import React, { Component } from 'react';
import {BrowserRouter, Route} from 'react-router-dom';
import './App.css';
import { withStyles } from '@material-ui/core/styles';
import TemporaryDrawer from './components/TemporaryDrawer';
import Home from './components/Home'
import Resume from './components/Resume'
import Crosswalk from './components/Crosswalk'
import BarkSensor from './components/BarkSensor'
import Website from './components/Website'

const styles = {
		  root: {
			display: 'flex',
			flexDirection: 'column',
			//width: '100%',
			height: '100vh',
		  },
		  header: {
		  },
		  body: {
			  width:'100%',
			  flex: '1',
		  },
		};

class App extends Component {
	render() {
		const { classes } = this.props;
		return (
				<BrowserRouter>
						<div className={classes.root}>
							<div className={classes.header}>
								<TemporaryDrawer/>
							</div>
							<div className={classes.body}>
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
						</div>
				</BrowserRouter>
		);
	}
}

export default withStyles(styles)(App);