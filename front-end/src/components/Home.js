import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'
import { withStyles } from '@material-ui/core/styles';

const styles = {
  root: {
    position: 'absolute',
	display: 'flex',
	flexDirection: 'column',
	width: '100%',
  },
  bioContainer: {
	  position: 'relative',
	  //height: '100%',
	  width:'100%',
  },
  projectsContainer: {
	  position: 'relative',
	  //height: '100%',
	  width:'100%',
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
