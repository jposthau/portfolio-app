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

};

class Crosswalk extends Component {
	render() {
		const { classes } = this.props;
		return (
			<div className={classes.root}>
				Crosswalk
			</div>
		);
	}
}

export default withStyles(styles)(Crosswalk);