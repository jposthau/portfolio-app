import React, { Component } from 'react';
import PDF from 'react-pdf-js';
import { withStyles } from '@material-ui/core/styles';
import Fab from '@material-ui/core/Fab';

const styles = {
	pdfContainer: {
		display: 'flex',
		justifyContent: 'center',
		flexDirection: 'column',
		width: '100%',
		textAlign: 'center',
		marginTop: '10px',
	},
	pdf: {
		width: '80vw',
		height: 'calc(80vw/(1224/1584))',
		boxShadow: '10px 10px 8px #888888',
		borderColor: 'black',
		borderStyle: 'solid',
		border: '1px',
		margin: 'auto',
		
	},
	button: {
		margin: '20px',
	}
};

class Resume extends Component {
	 	
	render() {
		const { classes } = this.props;
		return (
		  <div className={classes.pdfContainer}>
			<PDF 
			  className={classes.pdf}
			  scale="2"
			  file="/Resume.pdf"
			/>
			<div className={classes.button}>
				<Fab
					href="/Resume.pdf"
					variant="extended"
					size="medium"
					color="primary"
					aria-label="Add"
					className={classes.margin}
				>
					Download
				</Fab>
			</div>
		  </div>
		);
	}
}

export default withStyles(styles)(Resume);
