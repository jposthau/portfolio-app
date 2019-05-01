import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'
import { withStyles } from '@material-ui/core/styles';

const styles = {
  root: {
    //position: 'absolute',
	display: 'flex',
	flexDirection: 'column',
	width: '100%',
	height: '100%',
  },
  bioContainer: {
	  position: 'relative',
	  //flexGrow: '1',
  },
  projectsContainer: {
	  position: 'relative',
	  width:'100%',
	  flexGrow: '1',
  },
};

class Home extends Component {
	render() {
		const { classes } = this.props;
		return (
			<div className={classes.root}>
				<div className={classes.bioContainer}>
					<Bio/>
				</div>
				<div className={classes.projectsContainer}>
					<ButtonBases/>
				</div>
			</div>
		);
	}
}

export default withStyles(styles)(Home);
